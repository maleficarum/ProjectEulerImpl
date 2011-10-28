package mx.angellore.projecteulerimpl.utils

import scala.collection.mutable.ListBuffer
/**
 * Created by IntelliJ IDEA.
 * User: angellore
 * Date: 10/28/11
 * Time: 12:54 PM
 */

object Prime {

  //TODO Optimize flist initialization
  def apply(max:Int):List[Int] = {
    var list:List[Int] = (2 to max).toList
    var flist:ListBuffer[Int] = new ListBuffer()

    list.foreach(e => {
      flist.+(e)
    })

    flist.foreach(e => {flist.foreach(x => { if(e != x) { if (x % e == 0) { flist = flist.diff(List(x)) } } }) })
    flist.toList
  }
}