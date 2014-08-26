package code.comet

import net.liftweb.actor.LiftActor
import net.liftweb.http.ListenerManager

object ChatServer extends LiftActor with ListenerManager {

   private var msgs = Vector("Welcome")

   def createUpdate = msgs

   override def lowPriority = {
     case s: String => msgs :+= s; updateListeners()
   }

 }
