package com.cognifide.apmt.example

import com.cognifide.apmt.tests.page.CreatePageTest
import org.junit.jupiter.api.DisplayName

@DisplayName("Check user permissions to create pages")
class CustomCreatePageTest : CreatePageTest(
    testCase {
        paths(
            "/content/we-retail/us/es/apt-test-page"
        )
        allowedUsers(
            Users.GLOBAL_AUTHOR,
            Users.GLOBAL_SUPER_AUTHOR
        )
    },
    testCase {
        paths(
            "/content/we-retail/us/en/apt-test-page"
        )
        allowedUsers(
            Users.GLOBAL_AUTHOR,
            Users.GLOBAL_SUPER_AUTHOR,
            Users.LOCAL_AUTHOR,
            Users.LOCAL_SUPER_AUTHOR
        )
    },
    pageContent = {
        jcrTitle = "APMT"
        cqTemplate = "/conf/we-retail/settings/wcm/templates/content-page"
    }
)