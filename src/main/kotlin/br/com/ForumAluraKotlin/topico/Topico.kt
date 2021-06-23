package br.com.ForumAluraKotlin.topico

import br.com.ForumAluraKotlin.StatusTopico
import br.com.ForumAluraKotlin.curso.Curso
import br.com.ForumAluraKotlin.resposta.Resposta
import br.com.ForumAluraKotlin.usuario.Usuario
import java.time.LocalDateTime

data class Topico (
    val id: Long? = null,
    val titulo: String = "",
    val mensagem:String = "",
    val dataCriacao :LocalDateTime = LocalDateTime.now(),
    val curso : Curso,
    val autor : Usuario,
    val respostas : List<Resposta>,
    val status : StatusTopico = StatusTopico.NAO_RESPONDIDO
) {
}