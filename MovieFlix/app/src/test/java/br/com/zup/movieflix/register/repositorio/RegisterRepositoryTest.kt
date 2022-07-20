package br.com.zup.movieflix.register.repositorio

import br.com.zup.movieflix.register.model.RegisterModel
import org.junit.Assert.assertEquals
import org.junit.Test


class RegisterRepositoryTest {
    @Test
    fun regiterUser_informingAllData() {
        val registerRepository = RegisterRepository()
        // Arrange
        val user = RegisterModel(
            "Felipe",
            "felipe.dearaujo@gmail.com.br",
            "melhorProfessorDoMundo"
        )
        // ACT
        val result = registerRepository.registerUser(user)

        // Assert
        assertEquals(result.userName, "Felipe")
        assertEquals(result.email, "felipe.dearaujo@gmail.com.br")
        assertEquals(result.password, "melhorProfessorDoMundo")
    }
}