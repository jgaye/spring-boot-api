package io.swagger.api;

import io.swagger.model.Book;
import io.swagger.model.Error;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-11T21:38:03.095+02:00")

@Api(value = "library", description = "the library API")
public interface LibraryApi {

    @ApiOperation(value = "Remove a book from the library", notes = "Delete the full book entry ", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class) })
    @RequestMapping(value = "/library/{bookId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> libraryBookIdDelete(@ApiParam(value = "String input for book service",required=true ) @PathVariable("bookId") String bookId);


    @ApiOperation(value = "get info on a book", notes = "Get the title, author and if you read the book yet ", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class) })
    @RequestMapping(value = "/library/{bookId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> libraryBookIdGet(@ApiParam(value = "String input for book service",required=true ) @PathVariable("bookId") String bookId);


    @ApiOperation(value = "toggle the read status", notes = "Toggle the read status only, no body required ", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class) })
    @RequestMapping(value = "/library/{bookId}",
        produces = { "application/json" }, 
        method = RequestMethod.PATCH)
    ResponseEntity<Void> libraryBookIdPatch(@ApiParam(value = "String input for book service",required=true ) @PathVariable("bookId") String bookId);


    @ApiOperation(value = "change info of the book", notes = "Update the whole book model with the passed title, author and read status. ", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class) })
    @RequestMapping(value = "/library/{bookId}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> libraryBookIdPut(@ApiParam(value = "String input for book service",required=true ) @PathVariable("bookId") String bookId);


    @ApiOperation(value = "My list of books", notes = "List all the books in my library ", response = Book.class, responseContainer = "List", tags={ "Products", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of products", response = Book.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Book.class) })
    @RequestMapping(value = "/library",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Book>> libraryGet();


    @ApiOperation(value = "Add a book to the library", notes = "Add a book to the library ", response = Void.class, tags={ "Products", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The created Book", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    @RequestMapping(value = "/library",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> libraryPost();

}
