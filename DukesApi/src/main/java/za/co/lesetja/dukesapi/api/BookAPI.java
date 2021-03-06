package za.co.lesetja.dukesapi.api;

import java.util.List;

import javax.ws.rs.Consumes;
//import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;

import za.co.lesetja.dukesapi.dto.BookDTO;

@Path("/book/")
public interface BookAPI {

	@Path("/books")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<BookDTO> getBooks();
	
	@Path("/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public BookDTO getBook(@PathParam("id") int id);
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public BookDTO createBook(BookDTO book);
	
	@PUT
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public BookDTO updateBook(BookDTO book);
	
//	we don't delete, we update
//	@Path("/{id}")
//	@DELETE
//	public Response deleteBook(@PathParam("id") int id);
}
