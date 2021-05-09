import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.{console, document, window}
import threejs.BoxGeometry

object MainApp extends JSApp {

  def main(): Unit = {
    println("Starting 'threejstemplate'...")

    val scene = new threejs.Scene
    console.log(s"Scene: $scene")
    var camera = new threejs.PerspectiveCamera(75f, (window.innerWidth/window.innerHeight).toFloat, 0.1f, 1000f)
    console.log(s"PerspectiveCamera: $camera")
    val renderer = new threejs.WebGLRenderer(threejs.WebGLRendererParameters(antialias = true))
    renderer.setClearColor("#000000", 0.0f)
    renderer.setSize( window.innerWidth.toFloat, window.innerHeight.toFloat)
    console.log(s"WebGLRenderer: $renderer")
    document.body.appendChild( renderer.domElement )

    val geometry = new BoxGeometry(1,1,1,1,1,1)
    val material = new threejs.MeshBasicMaterial( threejs.MeshBasicMaterialParameters(color = "#433F81") )
    val cube = new threejs.Mesh( geometry, material )
    scene.add(cube)

    lazy val render: (Double) => _ = (_: Double) => {
      window.requestAnimationFrame( render )

      cube.rotation.x = cube.rotation.x + 0.01f
      cube.rotation.y = cube.rotation.y + 0.01f

      renderer.render(scene, camera)
    }

    val p = document.createElement("p")
    val text = document.createTextNode("Hello!")
    p.appendChild(text)
    document.body.appendChild(p)

    render(0.0)
  }

}
