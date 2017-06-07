/**
 *    Copyright (C) 2017 Remon Schopmeijer (79147FFF4E3C86DE) <support-telebot@dead-pixel.nl>
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
package nl.dead_pixel.telebot.api.types.keyboard.markups;

import nl.dead_pixel.telebot.interfaces.IReplyMarkup;
import nl.dead_pixel.telebot.api.types.keyboard.buttons.InlineKeyboardButton;

import java.util.List;


/**
 * The type Inline keyboard markup.
 */
public class InlineKeyboardMarkup implements IReplyMarkup {
    private List<List<InlineKeyboardButton>> inlineKeyboard;

    /**
     * Gets inline keyboard.
     *
     * @return the inline keyboard
     */
    public List<List<InlineKeyboardButton>> getInlineKeyboard() {
        return inlineKeyboard;
    }

    /**
     * Sets inline keyboard.
     *
     * @param inlineKeyboard the inline keyboard
     * @return the inline keyboard
     */
    private InlineKeyboardMarkup setInlineKeyboard(List<List<InlineKeyboardButton>> inlineKeyboard) {
        this.inlineKeyboard = inlineKeyboard;
        return this;
    }
}
