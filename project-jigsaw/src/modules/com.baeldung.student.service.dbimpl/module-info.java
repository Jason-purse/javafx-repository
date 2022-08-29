module com.baeldung.student.service.dbimpl {
    requires transitive com.baeldung.student.service;
    requires java.logging;
    exports com.baeldung.student.service.dbimpl;
}
