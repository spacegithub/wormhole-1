/*-
 * <<
 * wormhole
 * ==
 * Copyright (C) 2016 - 2017 EDP
 * ==
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
 * >>
 */


package edp.wormhole.sparkxinterface.swifts

import edp.wormhole.util.swifts.SwiftsSql

case class SwiftsProcessConfig(//projection:String,
                               swiftsSql:Option[Array[SwiftsSql]] = None,
                               validityConfig: Option[ValidityConfig] = None,
                               datasetShow:Option[Boolean] = None,
                               datasetShowNum:Option[Int] = None,
                               specialConfig:Option[String] = None)

case class SwiftsSpecialProcessConfig(`lookup_batch_size`:Option[Int] = None){
  lazy val batchSize=`lookup_batch_size`.getOrElse(1000)
}

case class ValidityConfig(checkColumns:Array[String],
                          checkRule:String,
                          rule_mode:String,
                          ruleParams:String,
                          againstAction:String)



