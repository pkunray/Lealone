/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.lealone.test.main;

import java.sql.SQLException;

import org.lealone.main.Shell;

//public class ShellTest extends TestBase {
//
//    public static void main(String[] args) throws SQLException {
//        ShellTest test = new ShellTest();
//        test.run();
//    }
//
//    void run() throws SQLException {
//        String url = getURL(LealoneDatabase.NAME);
//        String[] args = { "-url", url };
//        Shell.main(args);
//    }
//}

public class ShellTest {

    public static void main(String[] args) throws SQLException {
        System.setProperty("lealone.config", "lealone-test.yaml");
        String url = "jdbc:lealone:tcp://localhost:9210/lealone";
        url = "jdbc:lealone:embed:lealone";
        String[] args2 = { "-url", url, "-user", "root" };
        Shell.main(args2);
    }
}
