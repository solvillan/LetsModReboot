package se.doverfelt.letsModReboot.config;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Copyright (c) 2014 Rickard Doverfelt
 * <p/>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p/>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p/>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
public class ConfigurationHandler {

    public static void init(File configFile) {

        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try {
            //Load File
            configuration.load();

            //Read Properties
            configValue = configuration.get(configuration.CATEGORY_GENERAL, "configValue", true, "An example value").getBoolean(true);

        } catch (Exception e) {
            //Log the Exception
        } finally {
            configuration.save();
        }

        System.out.println("ConfigValue: " + configValue);

    }

}
