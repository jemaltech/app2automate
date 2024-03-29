package com.app2automate.repository.search;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;

/**
 * Configure a Mock version of {@link PostSearchRepository} to test the
 * application without starting Elasticsearch.
 */
@Configuration
public class PostSearchRepositoryMockConfiguration {

    @MockBean
    private PostSearchRepository mockPostSearchRepository;

}
