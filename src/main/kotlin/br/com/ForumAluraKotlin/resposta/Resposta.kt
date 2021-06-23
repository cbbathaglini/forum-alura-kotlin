package br.com.ForumAluraKotlin.resposta

import br.com.ForumAluraKotlin.StatusTopico
import br.com.ForumAluraKotlin.curso.Curso
import br.com.ForumAluraKotlin.topico.Topico
import br.com.ForumAluraKotlin.usuario.Usuario
import java.time.LocalDateTime

data class Resposta (
    val id: Long? = null,
    val mensagem:String = "",
    val dataCriacao : LocalDateTime = LocalDateTime.now(),
    val topico : Topico,
    val autor : Usuario,
    val solucao : Boolean,
) {
}