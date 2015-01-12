/*
 * Copyright 2014-2015 OpenEstate.org.
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
package org.openestate.is24.restapi.hc43;

import java.io.InputStream;
import org.apache.http.entity.mime.content.InputStreamBody;

/**
 * An extended {@link InputStreamBody}, that holds the total streamed size.
 *
 * @since 0.1
 * @author Andreas Rudolph <andy@openindex.de>
 */
public class InputStreamBodyWithLength extends InputStreamBody
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( InputStreamBodyWithLength.class );
  private final long length;

  /**
   * Creates an instance of {@link InputStreamBodyWithLength}.
   *
   * @param in
   * inputstream
   *
   * @param filename
   * file name
   *
   * @param length
   * file size
   */
  public InputStreamBodyWithLength( InputStream in, String filename, long length )
  {
    super( in, filename );
    this.length = length;
  }

  /**
   * Creates an instance of {@link InputStreamBodyWithLength}.
   *
   * @param in
   * inputstream
   *
   * @param mimeType
   * file mime type
   *
   * @param filename
   * file name
   *
   * @param length
   * file size
   */
  public InputStreamBodyWithLength( InputStream in, String mimeType, String filename, long length )
  {
    super( in, mimeType, filename );
    this.length = length;
  }

  /**
   * Returns size of the streamed content.
   *
   * @return
   * size in bytes
   */
  @Override
  public long getContentLength()
  {
    return this.length;
  }
}