/*
 * Copyright 2002-2013 the original author or authors.
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
package org.springframework.security.config.annotation.web;

/**
 * TODO rename this since it contains builders too
 *
 * @author Rob Winch
 *
 */
public final class WebSecurityConfigurators {
    public static ExpressionFilterInvocationSecurityMetadataSourceSecurityBuilder interceptUrls() {
        return new ExpressionFilterInvocationSecurityMetadataSourceSecurityBuilder();
    }

    public static FormLoginSecurityFilterConfigurator formLogin() throws Exception {
        return new FormLoginSecurityFilterConfigurator();
    }

    public static AnonymousSecurityFilterConfigurator anonymous() throws Exception {
        return new AnonymousSecurityFilterConfigurator();
    }

    public static ChannelSecurityFilterConfigurator requiresChannel() throws Exception {
        return new ChannelSecurityFilterConfigurator();
    }

    public static HttpBasicSecurityFilterConfigurator httpBasic() throws Exception {
        return new HttpBasicSecurityFilterConfigurator();
    }

    private WebSecurityConfigurators() {}
}