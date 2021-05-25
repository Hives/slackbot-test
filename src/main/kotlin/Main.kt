import com.slack.api.Slack
import com.slack.api.methods.kotlin_extension.request.chat.blocks

fun main() {
    val slack = Slack.getInstance()

    val token = System.getenv("SLACK_TOKEN")

    val response = slack.methods(token).chatPostMessage {
        it
            .channel("#hiveminds-channel")
            .blocks {
                section {
                    markdownText("*Hello*")
                }
                divider()
                section {
                    markdownText(
                        """
                            - Here's some markdown
                            - And some more
                            
                            > A quotation
                            > continues
                            
                            ```
                            Some.code.goesInHere()
                            ```
                            
                            <http://www.google.com|This is a link>
                        """.trimIndent()
                    )
                }
            }
    }

    println(response)
}