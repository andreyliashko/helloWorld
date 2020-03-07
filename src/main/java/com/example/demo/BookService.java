package com.example.demo;

import com.sun.org.apache.xerces.internal.impl.XMLEntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.w3c.dom.Entity;

@Service
@Component
@RequiredArgsConstructor
public class BookService {
    private EntityManager entityManager;

    @Transactional
    private EntityManager add(BookModel book){
      return   entityManager.merge(book);
    }
    private List<EntityManager> getAllBooks(){
        return entityManager.createQuery("select BookModel", BookModel.class).getResultList();
    }
}
