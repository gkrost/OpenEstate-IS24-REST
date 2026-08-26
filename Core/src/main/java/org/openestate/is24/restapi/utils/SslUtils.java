/*
 * Copyright 2014-2021 OpenEstate.org.
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
package org.openestate.is24.restapi.utils;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SSL helper methods.
 *
 * @author Andreas Rudolph
 * @since 0.2
 */
public final class SslUtils {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(SslUtils.class);

    private SslUtils() {
    }

    /**
     * Previously installed a {@code TrustManager} that accepted every
     * certificate. That allowed machine-in-the-middle attacks and was removed.
     *
     * @throws UnsupportedOperationException always
     */
    public static void disableCertificateChecks() throws NoSuchAlgorithmException, KeyManagementException {
        throw new UnsupportedOperationException(
                "Disabling TLS certificate checks was removed because it allowed "
                        + "machine-in-the-middle attacks.");
    }

    /**
     * Previously installed a {@code HostnameVerifier} that accepted every host
     * name. That allowed machine-in-the-middle attacks and was removed.
     *
     * @throws UnsupportedOperationException always
     */
    public static void disableHostnameVerification() {
        throw new UnsupportedOperationException(
                "Disabling TLS hostname verification was removed because it allowed "
                        + "machine-in-the-middle attacks.");
    }
}
