package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait MeshBasicMaterialParameters extends js.Object {
  val color: String = js.native
}

object MeshBasicMaterialParameters {
  def apply(color: String): MeshBasicMaterialParameters =
    js.Dynamic.literal(color = color).asInstanceOf[MeshBasicMaterialParameters]
}

@js.native
@JSGlobal("THREE.MeshBasicMaterial")
class MeshBasicMaterial(parameters: MeshBasicMaterialParameters) extends js.Object {

}
