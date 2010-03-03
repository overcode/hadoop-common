/**
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

package org.apache.hadoop.test.system.process;

import java.io.IOException;

/**
 * Interface to manage the remote process.
 */
public interface RemoteProcess {
  /**
   * Get the host on which the daemon process is running/stopped.<br/>
   * 
   * @return hostname on which process is running/stopped.
   */
  String getHostName();

  /**
   * Start a given daemon process.<br/>
   * 
   * @throws IOException if startup fails.
   */
  void start() throws IOException;

  /**
   * Stop a given daemon process.<br/>
   * 
   * @throws IOException if shutdown fails.
   */
  void kill() throws IOException;

  /**
   * Get the role of the Daemon in the cluster.
   * 
   * @return Enum
   */
  Enum<?> getRole();
}