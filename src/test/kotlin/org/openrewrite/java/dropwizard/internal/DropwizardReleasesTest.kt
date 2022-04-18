/*
 * Copyright 2022 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openrewrite.java.dropwizard.internal

import org.junit.jupiter.api.Test

import org.assertj.core.api.Assertions.assertThat

class DropwizardReleasesTest {
    @Test
    fun latestAvailableVersion() {
        val releases = DropwizardReleases()

        assertThat(releases.latestMatchingVersion("2.+"))
            .startsWith("2.")

        assertThat(releases.latestMatchingVersion("2.1.+"))
            .startsWith("2.1.")
    }

    @Test
    fun latestPatches() {
        val releases = DropwizardReleases()

        val patchReleases = releases.latestPatchReleases()
        assertThat(patchReleases).isNotEmpty()
        assertThat(patchReleases).allMatch { pr -> pr.isNotEmpty() }
        assertThat(patchReleases).anyMatch { pr -> pr.startsWith("1.2.")}
        assertThat(patchReleases).anyMatch { pr -> pr.startsWith("1.3.")}
        assertThat(patchReleases).anyMatch { pr -> pr.startsWith("2.0.")}
        assertThat(patchReleases).anyMatch { pr -> pr.startsWith("2.1.")}
    }
}
