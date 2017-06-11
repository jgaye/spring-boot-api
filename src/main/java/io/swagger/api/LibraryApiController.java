package io.swagger.api;

import io.swagger.model.Book;
import io.swagger.model.Error;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-11T21:38:03.095+02:00")

@Controller
public class LibraryApiController implements LibraryApi {



    public ResponseEntity<Void> libraryBookIdDelete(@ApiParam(value = "String input for book service",required=true ) @PathVariable("bookId") String bookId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> libraryBookIdGet(@ApiParam(value = "String input for book service",required=true ) @PathVariable("bookId") String bookId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> libraryBookIdPatch(@ApiParam(value = "String input for book service",required=true ) @PathVariable("bookId") String bookId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> libraryBookIdPut(@ApiParam(value = "String input for book service",required=true ) @PathVariable("bookId") String bookId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<Book>> libraryGet() {
        // do some magic!
        return new ResponseEntity<List<Book>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> libraryPost() {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
