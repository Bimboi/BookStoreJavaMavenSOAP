
package bookclient;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bookclient package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _AddBook_QNAME = new QName("http://applicationservice.com/", "addBook");
    private static final QName _AddBookResponse_QNAME = new QName("http://applicationservice.com/", "addBookResponse");
    private static final QName _GetAllBooks_QNAME = new QName("http://applicationservice.com/", "getAllBooks");
    private static final QName _GetAllBooksResponse_QNAME = new QName("http://applicationservice.com/", "getAllBooksResponse");
    private static final QName _GetBookById_QNAME = new QName("http://applicationservice.com/", "getBookById");
    private static final QName _GetBookByIdResponse_QNAME = new QName("http://applicationservice.com/", "getBookByIdResponse");
    private static final QName _RemoveBook_QNAME = new QName("http://applicationservice.com/", "removeBook");
    private static final QName _RemoveBookResponse_QNAME = new QName("http://applicationservice.com/", "removeBookResponse");
    private static final QName _UpdateBook_QNAME = new QName("http://applicationservice.com/", "updateBook");
    private static final QName _UpdateBookResponse_QNAME = new QName("http://applicationservice.com/", "updateBookResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bookclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddBook }
     * 
     * @return
     *     the new instance of {@link AddBook }
     */
    public AddBook createAddBook() {
        return new AddBook();
    }

    /**
     * Create an instance of {@link AddBookResponse }
     * 
     * @return
     *     the new instance of {@link AddBookResponse }
     */
    public AddBookResponse createAddBookResponse() {
        return new AddBookResponse();
    }

    /**
     * Create an instance of {@link GetAllBooks }
     * 
     * @return
     *     the new instance of {@link GetAllBooks }
     */
    public GetAllBooks createGetAllBooks() {
        return new GetAllBooks();
    }

    /**
     * Create an instance of {@link GetAllBooksResponse }
     * 
     * @return
     *     the new instance of {@link GetAllBooksResponse }
     */
    public GetAllBooksResponse createGetAllBooksResponse() {
        return new GetAllBooksResponse();
    }

    /**
     * Create an instance of {@link GetBookById }
     * 
     * @return
     *     the new instance of {@link GetBookById }
     */
    public GetBookById createGetBookById() {
        return new GetBookById();
    }

    /**
     * Create an instance of {@link GetBookByIdResponse }
     * 
     * @return
     *     the new instance of {@link GetBookByIdResponse }
     */
    public GetBookByIdResponse createGetBookByIdResponse() {
        return new GetBookByIdResponse();
    }

    /**
     * Create an instance of {@link RemoveBook }
     * 
     * @return
     *     the new instance of {@link RemoveBook }
     */
    public RemoveBook createRemoveBook() {
        return new RemoveBook();
    }

    /**
     * Create an instance of {@link RemoveBookResponse }
     * 
     * @return
     *     the new instance of {@link RemoveBookResponse }
     */
    public RemoveBookResponse createRemoveBookResponse() {
        return new RemoveBookResponse();
    }

    /**
     * Create an instance of {@link UpdateBook }
     * 
     * @return
     *     the new instance of {@link UpdateBook }
     */
    public UpdateBook createUpdateBook() {
        return new UpdateBook();
    }

    /**
     * Create an instance of {@link UpdateBookResponse }
     * 
     * @return
     *     the new instance of {@link UpdateBookResponse }
     */
    public UpdateBookResponse createUpdateBookResponse() {
        return new UpdateBookResponse();
    }

    /**
     * Create an instance of {@link Book }
     * 
     * @return
     *     the new instance of {@link Book }
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}
     */
    @XmlElementDecl(namespace = "http://applicationservice.com/", name = "addBook")
    public JAXBElement<AddBook> createAddBook(AddBook value) {
        return new JAXBElement<>(_AddBook_QNAME, AddBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddBookResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://applicationservice.com/", name = "addBookResponse")
    public JAXBElement<AddBookResponse> createAddBookResponse(AddBookResponse value) {
        return new JAXBElement<>(_AddBookResponse_QNAME, AddBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooks }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllBooks }{@code >}
     */
    @XmlElementDecl(namespace = "http://applicationservice.com/", name = "getAllBooks")
    public JAXBElement<GetAllBooks> createGetAllBooks(GetAllBooks value) {
        return new JAXBElement<>(_GetAllBooks_QNAME, GetAllBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooksResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllBooksResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://applicationservice.com/", name = "getAllBooksResponse")
    public JAXBElement<GetAllBooksResponse> createGetAllBooksResponse(GetAllBooksResponse value) {
        return new JAXBElement<>(_GetAllBooksResponse_QNAME, GetAllBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBookById }{@code >}
     */
    @XmlElementDecl(namespace = "http://applicationservice.com/", name = "getBookById")
    public JAXBElement<GetBookById> createGetBookById(GetBookById value) {
        return new JAXBElement<>(_GetBookById_QNAME, GetBookById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBookByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://applicationservice.com/", name = "getBookByIdResponse")
    public JAXBElement<GetBookByIdResponse> createGetBookByIdResponse(GetBookByIdResponse value) {
        return new JAXBElement<>(_GetBookByIdResponse_QNAME, GetBookByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveBook }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveBook }{@code >}
     */
    @XmlElementDecl(namespace = "http://applicationservice.com/", name = "removeBook")
    public JAXBElement<RemoveBook> createRemoveBook(RemoveBook value) {
        return new JAXBElement<>(_RemoveBook_QNAME, RemoveBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveBookResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveBookResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://applicationservice.com/", name = "removeBookResponse")
    public JAXBElement<RemoveBookResponse> createRemoveBookResponse(RemoveBookResponse value) {
        return new JAXBElement<>(_RemoveBookResponse_QNAME, RemoveBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBook }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateBook }{@code >}
     */
    @XmlElementDecl(namespace = "http://applicationservice.com/", name = "updateBook")
    public JAXBElement<UpdateBook> createUpdateBook(UpdateBook value) {
        return new JAXBElement<>(_UpdateBook_QNAME, UpdateBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBookResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateBookResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://applicationservice.com/", name = "updateBookResponse")
    public JAXBElement<UpdateBookResponse> createUpdateBookResponse(UpdateBookResponse value) {
        return new JAXBElement<>(_UpdateBookResponse_QNAME, UpdateBookResponse.class, null, value);
    }

}
