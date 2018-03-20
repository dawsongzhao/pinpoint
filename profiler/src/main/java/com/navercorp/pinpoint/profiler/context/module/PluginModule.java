/*
 * Copyright 2018 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.profiler.context.module;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.navercorp.pinpoint.common.service.AnnotationKeyRegistryService;
import com.navercorp.pinpoint.common.service.ServiceTypeRegistryService;
import com.navercorp.pinpoint.common.service.TraceMetadataLoaderService;
import com.navercorp.pinpoint.profiler.context.provider.plugin.AnnotationKeyRegistryServiceProvider;
import com.navercorp.pinpoint.profiler.context.provider.plugin.ServiceTypeRegistryServiceProvider;
import com.navercorp.pinpoint.profiler.context.provider.plugin.TraceMetadataLoaderServiceProvider;

/**
 * @author Woonduk Kang(emeroad)
 */
public class PluginModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(TraceMetadataLoaderService.class).toProvider(TraceMetadataLoaderServiceProvider.class).in(Scopes.SINGLETON);
        bind(ServiceTypeRegistryService.class).toProvider(ServiceTypeRegistryServiceProvider.class).in(Scopes.SINGLETON);
        bind(AnnotationKeyRegistryService.class).toProvider(AnnotationKeyRegistryServiceProvider.class).in(Scopes.SINGLETON);
    }
}
