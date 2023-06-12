/*
 * Copyright 2023 sberg it-systeme GmbH
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved
 * by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://ec.europa.eu/idabc/eupl
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 */
package net.sberg.openkim.testtool;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SendReceiveResult {
    private String id;
    private String konnektorId;
    private String username;
    private String password;
    private String mailFilename;
    private List<String> receivedMails = new ArrayList<>();
}
