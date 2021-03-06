/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.spi.PollingConsumerPollStrategy;

/**
 * Poll for changes in Google Sheets.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GoogleSheetsStreamEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Google Sheets Stream component.
     */
    public interface GoogleSheetsStreamEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedGoogleSheetsStreamEndpointBuilder advanced() {
            return (AdvancedGoogleSheetsStreamEndpointBuilder) this;
        }
        /**
         * OAuth 2 access token. This typically expires after an hour so
         * refreshToken is recommended for long term usage.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default GoogleSheetsStreamEndpointBuilder accessToken(String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
        /**
         * Google sheets application name. Example would be
         * camel-google-sheets/1.0.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default GoogleSheetsStreamEndpointBuilder applicationName(
                String applicationName) {
            doSetProperty("applicationName", applicationName);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default GoogleSheetsStreamEndpointBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default GoogleSheetsStreamEndpointBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Client ID of the sheets application.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default GoogleSheetsStreamEndpointBuilder clientId(String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * Client secret of the sheets application.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default GoogleSheetsStreamEndpointBuilder clientSecret(
                String clientSecret) {
            doSetProperty("clientSecret", clientSecret);
            return this;
        }
        /**
         * True if grid data should be returned.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default GoogleSheetsStreamEndpointBuilder includeGridData(
                boolean includeGridData) {
            doSetProperty("includeGridData", includeGridData);
            return this;
        }
        /**
         * True if grid data should be returned.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default GoogleSheetsStreamEndpointBuilder includeGridData(
                String includeGridData) {
            doSetProperty("includeGridData", includeGridData);
            return this;
        }
        /**
         * Specifies the major dimension that results should use..
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: ROWS
         * Group: consumer
         */
        default GoogleSheetsStreamEndpointBuilder majorDimension(
                String majorDimension) {
            doSetProperty("majorDimension", majorDimension);
            return this;
        }
        /**
         * Specify the maximum number of returned results. This will limit the
         * number of rows in a returned value range data set or the number of
         * returned value ranges in a batch request.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 0
         * Group: consumer
         */
        default GoogleSheetsStreamEndpointBuilder maxResults(int maxResults) {
            doSetProperty("maxResults", maxResults);
            return this;
        }
        /**
         * Specify the maximum number of returned results. This will limit the
         * number of rows in a returned value range data set or the number of
         * returned value ranges in a batch request.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 0
         * Group: consumer
         */
        default GoogleSheetsStreamEndpointBuilder maxResults(String maxResults) {
            doSetProperty("maxResults", maxResults);
            return this;
        }
        /**
         * Specifies the range of rows and columns in a sheet to get data from.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default GoogleSheetsStreamEndpointBuilder range(String range) {
            doSetProperty("range", range);
            return this;
        }
        /**
         * OAuth 2 refresh token. Using this, the Google Calendar component can
         * obtain a new accessToken whenever the current one expires - a
         * necessity if the application is long-lived.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default GoogleSheetsStreamEndpointBuilder refreshToken(
                String refreshToken) {
            doSetProperty("refreshToken", refreshToken);
            return this;
        }
        /**
         * Specifies the level of permissions you want a sheets application to
         * have to a user account. See
         * https://developers.google.com/identity/protocols/googlescopes for
         * more info.
         * 
         * The option is a: <code>java.util.List&lt;java.lang.String&gt;</code>
         * type.
         * 
         * Group: consumer
         */
        default GoogleSheetsStreamEndpointBuilder scopes(List<String> scopes) {
            doSetProperty("scopes", scopes);
            return this;
        }
        /**
         * Specifies the level of permissions you want a sheets application to
         * have to a user account. See
         * https://developers.google.com/identity/protocols/googlescopes for
         * more info.
         * 
         * The option will be converted to a
         * <code>java.util.List&lt;java.lang.String&gt;</code> type.
         * 
         * Group: consumer
         */
        default GoogleSheetsStreamEndpointBuilder scopes(String scopes) {
            doSetProperty("scopes", scopes);
            return this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default GoogleSheetsStreamEndpointBuilder sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            doSetProperty("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default GoogleSheetsStreamEndpointBuilder sendEmptyMessageWhenIdle(
                String sendEmptyMessageWhenIdle) {
            doSetProperty("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return this;
        }
        /**
         * True if value range result should be split into rows or columns to
         * process each of them individually. When true each row or column is
         * represented with a separate exchange in batch processing. Otherwise
         * value range object is used as exchange junk size.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default GoogleSheetsStreamEndpointBuilder splitResults(
                boolean splitResults) {
            doSetProperty("splitResults", splitResults);
            return this;
        }
        /**
         * True if value range result should be split into rows or columns to
         * process each of them individually. When true each row or column is
         * represented with a separate exchange in batch processing. Otherwise
         * value range object is used as exchange junk size.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default GoogleSheetsStreamEndpointBuilder splitResults(
                String splitResults) {
            doSetProperty("splitResults", splitResults);
            return this;
        }
        /**
         * Specifies the spreadsheet identifier that is used to identify the
         * target to obtain.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default GoogleSheetsStreamEndpointBuilder spreadsheetId(
                String spreadsheetId) {
            doSetProperty("spreadsheetId", spreadsheetId);
            return this;
        }
        /**
         * Determines how values should be rendered in the output.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: FORMATTED_VALUE
         * Group: consumer
         */
        default GoogleSheetsStreamEndpointBuilder valueRenderOption(
                String valueRenderOption) {
            doSetProperty("valueRenderOption", valueRenderOption);
            return this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder backoffErrorThreshold(
                int backoffErrorThreshold) {
            doSetProperty("backoffErrorThreshold", backoffErrorThreshold);
            return this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder backoffErrorThreshold(
                String backoffErrorThreshold) {
            doSetProperty("backoffErrorThreshold", backoffErrorThreshold);
            return this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder backoffIdleThreshold(
                int backoffIdleThreshold) {
            doSetProperty("backoffIdleThreshold", backoffIdleThreshold);
            return this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder backoffIdleThreshold(
                String backoffIdleThreshold) {
            doSetProperty("backoffIdleThreshold", backoffIdleThreshold);
            return this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder backoffMultiplier(
                int backoffMultiplier) {
            doSetProperty("backoffMultiplier", backoffMultiplier);
            return this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder backoffMultiplier(
                String backoffMultiplier) {
            doSetProperty("backoffMultiplier", backoffMultiplier);
            return this;
        }
        /**
         * Milliseconds before the next poll.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 500
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder delay(long delay) {
            doSetProperty("delay", delay);
            return this;
        }
        /**
         * Milliseconds before the next poll.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 500
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder delay(String delay) {
            doSetProperty("delay", delay);
            return this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder greedy(boolean greedy) {
            doSetProperty("greedy", greedy);
            return this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder greedy(String greedy) {
            doSetProperty("greedy", greedy);
            return this;
        }
        /**
         * Milliseconds before the first poll starts.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 1000
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder initialDelay(long initialDelay) {
            doSetProperty("initialDelay", initialDelay);
            return this;
        }
        /**
         * Milliseconds before the first poll starts.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 1000
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder initialDelay(
                String initialDelay) {
            doSetProperty("initialDelay", initialDelay);
            return this;
        }
        /**
         * Specifies a maximum limit of number of fires. So if you set it to 1,
         * the scheduler will only fire once. If you set it to 5, it will only
         * fire five times. A value of zero or negative means fire forever.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 0
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder repeatCount(long repeatCount) {
            doSetProperty("repeatCount", repeatCount);
            return this;
        }
        /**
         * Specifies a maximum limit of number of fires. So if you set it to 1,
         * the scheduler will only fire once. If you set it to 5, it will only
         * fire five times. A value of zero or negative means fire forever.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 0
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder repeatCount(String repeatCount) {
            doSetProperty("repeatCount", repeatCount);
            return this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that.
         * 
         * The option is a: <code>org.apache.camel.LoggingLevel</code> type.
         * 
         * Default: TRACE
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder runLoggingLevel(
                LoggingLevel runLoggingLevel) {
            doSetProperty("runLoggingLevel", runLoggingLevel);
            return this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.LoggingLevel</code> type.
         * 
         * Default: TRACE
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder runLoggingLevel(
                String runLoggingLevel) {
            doSetProperty("runLoggingLevel", runLoggingLevel);
            return this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool.
         * 
         * The option is a:
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         * 
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder scheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            doSetProperty("scheduledExecutorService", scheduledExecutorService);
            return this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool.
         * 
         * The option will be converted to a
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         * 
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder scheduledExecutorService(
                String scheduledExecutorService) {
            doSetProperty("scheduledExecutorService", scheduledExecutorService);
            return this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz
         * component.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: none
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder scheduler(String scheduler) {
            doSetProperty("scheduler", scheduler);
            return this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz, Spring based scheduler.
         * 
         * The option is a: <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         * 
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder schedulerProperties(
                Map<String, Object> schedulerProperties) {
            doSetProperty("schedulerProperties", schedulerProperties);
            return this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz, Spring based scheduler.
         * 
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         * 
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder schedulerProperties(
                String schedulerProperties) {
            doSetProperty("schedulerProperties", schedulerProperties);
            return this;
        }
        /**
         * Whether the scheduler should be auto started.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder startScheduler(
                boolean startScheduler) {
            doSetProperty("startScheduler", startScheduler);
            return this;
        }
        /**
         * Whether the scheduler should be auto started.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder startScheduler(
                String startScheduler) {
            doSetProperty("startScheduler", startScheduler);
            return this;
        }
        /**
         * Time unit for initialDelay and delay options.
         * 
         * The option is a: <code>java.util.concurrent.TimeUnit</code> type.
         * 
         * Default: MILLISECONDS
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder timeUnit(TimeUnit timeUnit) {
            doSetProperty("timeUnit", timeUnit);
            return this;
        }
        /**
         * Time unit for initialDelay and delay options.
         * 
         * The option will be converted to a
         * <code>java.util.concurrent.TimeUnit</code> type.
         * 
         * Default: MILLISECONDS
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder timeUnit(String timeUnit) {
            doSetProperty("timeUnit", timeUnit);
            return this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder useFixedDelay(
                boolean useFixedDelay) {
            doSetProperty("useFixedDelay", useFixedDelay);
            return this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: scheduler
         */
        default GoogleSheetsStreamEndpointBuilder useFixedDelay(
                String useFixedDelay) {
            doSetProperty("useFixedDelay", useFixedDelay);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Google Sheets Stream component.
     */
    public interface AdvancedGoogleSheetsStreamEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default GoogleSheetsStreamEndpointBuilder basic() {
            return (GoogleSheetsStreamEndpointBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedGoogleSheetsStreamEndpointBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedGoogleSheetsStreamEndpointBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedGoogleSheetsStreamEndpointBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedGoogleSheetsStreamEndpointBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel.
         * 
         * The option is a:
         * <code>org.apache.camel.spi.PollingConsumerPollStrategy</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedGoogleSheetsStreamEndpointBuilder pollStrategy(
                PollingConsumerPollStrategy pollStrategy) {
            doSetProperty("pollStrategy", pollStrategy);
            return this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.PollingConsumerPollStrategy</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedGoogleSheetsStreamEndpointBuilder pollStrategy(
                String pollStrategy) {
            doSetProperty("pollStrategy", pollStrategy);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedGoogleSheetsStreamEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedGoogleSheetsStreamEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedGoogleSheetsStreamEndpointBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedGoogleSheetsStreamEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface GoogleSheetsStreamBuilders {
        /**
         * Google Sheets Stream (camel-google-sheets)
         * Poll for changes in Google Sheets.
         * 
         * Category: api,cloud,sheets
         * Since: 2.23
         * Maven coordinates: org.apache.camel:camel-google-sheets
         * 
         * Syntax: <code>google-sheets-stream:apiName</code>
         * 
         * Path parameter: apiName
         * Sets the apiName.
         * 
         * @param path apiName
         */
        default GoogleSheetsStreamEndpointBuilder googleSheetsStream(String path) {
            return GoogleSheetsStreamEndpointBuilderFactory.endpointBuilder("google-sheets-stream", path);
        }
        /**
         * Google Sheets Stream (camel-google-sheets)
         * Poll for changes in Google Sheets.
         * 
         * Category: api,cloud,sheets
         * Since: 2.23
         * Maven coordinates: org.apache.camel:camel-google-sheets
         * 
         * Syntax: <code>google-sheets-stream:apiName</code>
         * 
         * Path parameter: apiName
         * Sets the apiName.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path apiName
         */
        default GoogleSheetsStreamEndpointBuilder googleSheetsStream(
                String componentName,
                String path) {
            return GoogleSheetsStreamEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static GoogleSheetsStreamEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class GoogleSheetsStreamEndpointBuilderImpl extends AbstractEndpointBuilder implements GoogleSheetsStreamEndpointBuilder, AdvancedGoogleSheetsStreamEndpointBuilder {
            public GoogleSheetsStreamEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new GoogleSheetsStreamEndpointBuilderImpl(path);
    }
}