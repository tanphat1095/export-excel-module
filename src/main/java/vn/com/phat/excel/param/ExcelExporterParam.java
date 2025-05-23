/*
 * Copyright 2025 tanphat.1095
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package vn.com.phat.excel.param;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import java.util.List;
import java.util.function.Consumer;

/**
 * @author phatlt
 */
public interface ExcelExporterParam{
    List<ExcelExporterSheetParam> getSheets();
    String getDatePattern();
    Consumer<SXSSFWorkbook> getConsumer();
    String getOutputName();
    String getTemplatePath();

}
