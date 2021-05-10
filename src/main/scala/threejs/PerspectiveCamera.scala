package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("THREE.PerspectiveCamera")
class PerspectiveCamera(fov: Float, aspect: Float, near: Float, far: Float) extends js.Object {
  var position: PositionParameters = js.native
}
