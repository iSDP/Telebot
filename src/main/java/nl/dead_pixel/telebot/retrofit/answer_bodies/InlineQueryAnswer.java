/**
 *    Copyright (C) 2017 Remon Schopmeijer (7914 7FFF 4E3C 86DE) <support-telebot@dead-pixel.nl>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package nl.dead_pixel.telebot.retrofit.answer_bodies;

import nl.dead_pixel.telebot.interfaces.IInlineQueryResult;

import java.util.List;
import java.util.Optional;

/**
 * The type Inline query answer.
 *
 * @author ReSco
 * @since 22 :34 2-6-2017
 */
public class InlineQueryAnswer {
    private String inlineQueryId;
    private List<IInlineQueryResult> inlineQueryResults;
    private Optional<Long> cacheTime = Optional.empty();
    private Optional<Boolean> isPersonal = Optional.empty();
    private Optional<String> nextOffset = Optional.empty();
    private Optional<String> switchPmText = Optional.empty();
    private Optional<String> switchPmParameter = Optional.empty();
}
