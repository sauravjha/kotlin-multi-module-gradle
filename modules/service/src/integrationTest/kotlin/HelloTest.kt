import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class HelloTest : StringSpec({
    "return correct message" {
        helloWorldService("world") shouldBe "Hello, world!"
    }
})