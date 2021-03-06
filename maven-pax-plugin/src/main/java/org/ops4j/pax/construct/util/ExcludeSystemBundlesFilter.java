package org.ops4j.pax.construct.util;

/*
 * Copyright 2007 Stuart McCulloch
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.Arrays;

import org.apache.maven.artifact.resolver.filter.ExcludesArtifactFilter;

/**
 * Special artifact filter that excludes known OSGi system bundles
 */
public class ExcludeSystemBundlesFilter extends ExcludesArtifactFilter
{
    /**
     * List of OSGi system bundles found in Maven repositories
     */
    private static final String[] SYSTEM_BUNDLE_ARTIFACTS =
    {
        "org.eclipse:osgi", "org.eclipse.osgi:org.eclipse.osgi", "org.apache.felix:org.apache.felix.main",
        "org.knopflerfish.osgi:framework"
    };

    /**
     * By default exclude all OSGi system bundles
     */
    public ExcludeSystemBundlesFilter()
    {
        super( Arrays.asList( SYSTEM_BUNDLE_ARTIFACTS ) );
    }
}
