package threejs

import org.scalajs.dom.Element

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal


@js.native
trait WebGLRendererParameters extends js.Object {
  val antialias: Boolean = js.native
}

object WebGLRendererParameters {
  def apply(antialias: Boolean): WebGLRendererParameters =
    js.Dynamic.literal(antialias = antialias).asInstanceOf[WebGLRendererParameters]
}

@js.native
trait WebGLRendererInterface extends js.Object {
  def setClearColor(color: String, alpha: Float): Unit = js.native
  def setSize(width: Float, height: Float): Unit = js.native
  val domElement: Element = js.native
  def render(scene: Scene, camera: PerspectiveCamera): Unit = js.native
}

@js.native
@JSGlobal("THREE.WebGLRenderer")
class WebGLRenderer(parameters: js.Object) extends WebGLRendererInterface {
}
