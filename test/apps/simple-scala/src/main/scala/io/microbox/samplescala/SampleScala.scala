package cloud.microbox.samplescala

import org.scalatra._

class SampleScala extends SamplescalaStack {

  get("/") {
	"Hello World!"
  }

}
