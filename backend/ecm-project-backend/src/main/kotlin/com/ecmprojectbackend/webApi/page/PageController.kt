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
    fun getAll(): List<Page> {
        return pageService.getAll()
    }
    @GetMapping(path = ["/{pageId}"], produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun get(@PathVariable pageId: Long): Page {
        return pageService.get(pageId)
    }

    @GetMapping(path = ["/datatype/{dataTypeId}"], produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun getByDataTypeId(@PathVariable dataTypeId: Long): List<Page> {
        return pageService.getByDataTypeId(dataTypeId)
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