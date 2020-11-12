package com.cognifide.apmt.example

import com.cognifide.apmt.BasicTestCase
import com.cognifide.apmt.TestCase
import com.cognifide.apmt.User

const val PASSWORD = "P@SsWorD"

enum class Users(
    override val username: String,
    override val password: String
) : User {
    GLOBAL_AUTHOR("global-test-author", PASSWORD),
    LOCAL_AUTHOR("en_us-test-author", PASSWORD),
    GLOBAL_SUPER_AUTHOR("global-test-super-author", PASSWORD),
    LOCAL_SUPER_AUTHOR("en_us-test-super-author", PASSWORD)
}

fun testCase(init: BasicTestCase.() -> Unit): TestCase {
    val result = BasicTestCase()
    result.apply(init)
    result.allUsers = Users.values().toList()
    return result
}