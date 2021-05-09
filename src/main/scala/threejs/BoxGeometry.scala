package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("THREE.BoxGeometry")
class BoxGeometry(width : Float, height : Float, depth : Float,
                  widthSegments : Int, heightSegments : Int, depthSegments : Int)
  extends BufferGeometry {

}
