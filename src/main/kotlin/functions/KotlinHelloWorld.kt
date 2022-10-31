package functions

import com.google.cloud.functions.HttpFunction
import com.google.cloud.functions.HttpRequest
import com.google.cloud.functions.HttpResponse
import java.io.IOException

class HelloWorld : HttpFunction {
    // Simple function to return "Hello World"
    @Throws(IOException::class)
    override fun service(request: HttpRequest, response: HttpResponse) {
        response.writer.write("Hello World and Ben!")
    }
}