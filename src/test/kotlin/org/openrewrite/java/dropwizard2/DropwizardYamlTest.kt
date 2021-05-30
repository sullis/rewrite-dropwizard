package org.openrewrite.java.dropwizard2

import org.junit.jupiter.api.Test
import org.openrewrite.java.JavaParser
import org.openrewrite.java.JavaRecipeTest

class DropwizardYamlTest : JavaRecipeTest {
    override val parser = JavaParser.fromJavaVersion().build()
    override val recipe = DropwizardYaml()

    @Test
    fun emptyStringIsUnchanged() = assertUnchanged(before = "abc")
}