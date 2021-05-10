package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait RotationParameters extends js.Object {
  var x: Float = js.native
  var y: Float = js.native
  var z: Float = js.native
}

@js.native
trait PositionParameters extends js.Object {
  var x: Float = js.native
  var y: Float = js.native
  var z: Float = js.native
}

object RotationParameters {
  def apply(x: Float, y: Float, z: Float): RotationParameters =
    js.Dynamic.literal(x = x, y = y, z = z).asInstanceOf[RotationParameters]
}

@js.native
@JSGlobal("THREE.Mesh")
class Mesh(geometry: BufferGeometry, material: MeshBasicMaterial) extends Object3D {
  var rotation: RotationParameters = js.native
}
