
trait Annotated {
  @SuppressWarnings(Array(Constants.Unchecked))
  def annotated()
}

object Constants {
  final val Un = "un"
  final val Checked = "checked"
  final val Unchecked = Un + Checked
}