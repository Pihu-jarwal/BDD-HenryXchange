/*
 * MIT License
 *
 * Copyright (c) 2022 Rahul Rana
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

package utils;

import static org.apache.commons.text.StringSubstitutor.createInterpolator;
import static org.apache.logging.log4j.LogManager.getLogger;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.text.StringSubstitutor;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.ParameterizedMessage;
import org.openqa.selenium.InvalidArgumentException;

/**
 * String utils.
 *
 * @author Rahul Rana
 * @since 24-Feb-2022
 */
public final class StringUtils {
    private static final Logger LOGGER             = getLogger ();
    private static final String SURROUNDING_QUOTES = "^[\"'].*[\"']$";

    /**
     * Returns a formatted String by replacing each instance of {} placeholders  with the given arguments.
     *
     * @param messagePattern the message pattern containing placeholders.
     * @param arguments the arguments to be used to replace placeholders.
     *
     * @return String the formatted message
     */
    public static String format (final String messagePattern, Object... arguments) {
        return ParameterizedMessage.format (messagePattern, arguments);
    }

    /**
     * Returns the string passed without surrounding single (') or double (") quotes if they exist. Otherwise it returns
     * the string unchanged. Quotes inside the string will not be removed. Likewise, if there are not matching quotes on
     * both ends, a leading or trailing quote will be left unmodified.
     *
     * @param text String the text to check for surrounding quotes
     *
     * @return String the text without surrounding quotes (if they exist)
     */
    public static String stripSurroundingQuotes (String text) {
        if (text == null)
            return null;
        Pattern pattern = Pattern.compile (SURROUNDING_QUOTES);

        if (pattern.matcher (text)
            .find ())
            return text.substring (1, text.length () - 1);
        return text;
    }

    /**
     * Constructs the ordinal string of the given int. For example "1st", "2nd", "111th"
     *
     * @param i int the integer to create an ordinal string for
     *
     * @return String the ordinal string
     */
    public static String ordinal (int i) {
        if (i < 0)
            throw new InvalidArgumentException ("Integer must be non-negative to produce ordinal.");
        String[] suffixes = new String[] { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
        switch (i % 100) {
            case 11, 12, 13 -> {
                return i + "th";
            }
            default -> {
                return i + suffixes[i % 10];
            }
        }
    }

    /**
     * Replace all variables in the given string with the values from system environment variables, system properties,
     * etc.
     *
     * @param value String to be interpolated
     *
     * @return Interpolated string
     */
    public static String interpolate (final String value) {
        LOGGER.traceEntry ("Interpolating string: {}", value);
        var result = value;
        if (value != null && value.startsWith ("${")) {
            final var substitute = createInterpolator ();
            substitute.setEnableSubstitutionInVariables (true);
            result = substitute.replace (value);
        }
        LOGGER.traceExit ();
        return result;
    }

    /**
     * Replace all the variables in the given string with the values from the specified map.
     *
     * @param value String to be interpolated
     * @param valuesMap Map of values to lookup for variables
     *
     * @return Interpolated string
     */
    public static String interpolate (final String value, final Map<String, String> valuesMap) {
        LOGGER.traceEntry ("Interpolating string: {}", value);
        var result = value;
        if (value.contains ("${")) {
            final var substitute = new StringSubstitutor (valuesMap);
            substitute.setEnableSubstitutionInVariables (true);
            result = substitute.replace (value);
        }
        LOGGER.traceExit ();
        return result;
    }

    public static boolean isAlphanumeric(String input) {
        LOGGER.traceEntry ("Checking string for alphanumeric: {}", input);
        final var REGEX = "^[a-zA-Z0-9]*$";
        Pattern PATTERN = Pattern.compile(REGEX);
        Matcher MATCHER = PATTERN.matcher(input);
        return LOGGER.traceExit (MATCHER.matches ());
    }

    public static boolean isAlphanumericWithSpace(String input) {
        LOGGER.traceEntry ("Checking string for alphanumeric: {}", input);
        final var REGEX = "^[a-zA-Z0-9\\s+]*$";
        Pattern PATTERN = Pattern.compile(REGEX);
        Matcher MATCHER = PATTERN.matcher(input);
        return LOGGER.traceExit (MATCHER.matches ());
    }

    public static boolean isAlphanumericWithHyphen(String input) {
        LOGGER.traceEntry ("Checking string for alphanumeric: {}", input);
        final var REGEX = "^[a-zA-Z0-9-]*$";
        Pattern PATTERN = Pattern.compile(REGEX);
        Matcher MATCHER = PATTERN.matcher(input);
        return LOGGER.traceExit (MATCHER.matches ());
    }

    public static boolean isStateValid(String state){
        LOGGER.traceEntry ();
        final var REGEX = "AL|AK|AR|AZ|CA|CO|CT|DE|DC|FL|GA|HI|ID|IL|IN|IA|KS|KY|LA|ME|MD|MA|MI|MN"
            + "|MS|MO|MT|NE|NV|NH|NJ|NM|NY|NC|ND|OH|OK|OR|PA|RI|SC|SD|TN|TX|UT|VT|VA|WA|WV|WI|WY";
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(state);
        return LOGGER.traceExit (matcher.matches ());
    }

    public static boolean isValidDouble(String input) {
        LOGGER.traceEntry ();
        var isValidDouble = false;
        try {
            Double.parseDouble (input);
            isValidDouble = true;
        } catch (Exception e) {
            LOGGER.warn (e);
        }
        return LOGGER.traceExit (isValidDouble);
    }

    private StringUtils () {
        // Utility class
    }
}
