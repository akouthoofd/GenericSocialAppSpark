package app.profile

import app.util.{Path, ViewUtil}
import spark.Route

/**
  * Created by alex on 5/7/2017.
  */
object ProfileMainController {
  def updateUser(): Route = (_, _) => {
    ""
  }

  def displayPage(): Route = (request, _) => {
    ViewUtil.render(request, new java.util.HashMap(), Path.Template.HOME_PROFILE)
  }
}