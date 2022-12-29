package com.ecmprojectbackend.webApi.page

import com.ecmprojectbackend.domain.dataType.DataType
import com.ecmprojectbackend.domain.page.Page
import com.ecmprojectbackend.domain.page.PageService
import com.ecmprojectbackend.webApi.page.representation.PageRepresentation
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("page")
class PageController(
    private val pageService: PageService
) {
    @PutMapping(produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun save(@RequestBody pageRepresentation: PageRepresentation): Page {
        return pageService.save(
            Page(
                pageRepresentation.id,
                DataType(
                    pageRepresentation.dataTypeId,
                    ""
                ),
                pageRepresentation.name,
                pageRepresentation.content
            )
        )
    }

    @GetMapping(produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun get(): List<Page> {
        return pageService.getAll()
    }

    @DeleteMapping(produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun delete(@RequestParam pageId: Long) {
        pageService.remove(Page(
            pageId,
            null,
            "",
            ""
        ))
    }
}