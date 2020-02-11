package controllers


object MyForm {
  import play.api.data._
  import play.api.data.Forms._


  case class Data(name: String, password: String, radio:String)


val myform = Form(
  mapping(
    "name" -> text,
    "password" -> text,
    "radio" -> text
  )(Data.apply)(Data.unapply)
)

}
