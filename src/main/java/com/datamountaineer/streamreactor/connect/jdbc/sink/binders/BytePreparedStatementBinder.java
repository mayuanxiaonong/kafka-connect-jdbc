/**
 * Copyright 2015 Datamountaineer.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

package com.datamountaineer.streamreactor.connect.jdbc.sink.binders;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Handles binding a Byte for a prepared statement
 * */
public final class BytePreparedStatementBinder extends BasePreparedStatementBinder {
  private final byte value;

  public BytePreparedStatementBinder(String name, byte value) {
    super(name);
    this.value = value;
  }

  /**
   * Bind the value to the prepared statement.
   *
   * @param index The ordinal position to bind the variable to.
   * @param statement The prepared statement to bind to.
   * @return The statement with the value bound.
   * */
  @Override
  public void bind(int index, PreparedStatement statement) throws SQLException {
    statement.setByte(index, value);
  }

  /**
   * @return The value to be bound.
   * */
  public byte getValue() {
    return value;
  }
}
