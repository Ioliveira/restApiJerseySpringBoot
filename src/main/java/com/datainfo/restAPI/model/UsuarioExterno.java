package com.datainfo.restAPI.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity
@Table(name = "USUARIO_EXTERNO")
public class UsuarioExterno implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6625017086758741337L;

	@Id
	@Column(name = "NU_CPF", length = 11)
	private String numeroCpf;
	
	@Column(name = "NO_USUARIO", nullable = false, length = 60)
	private String nomeUsuario;
	
	@Column(name = "DE_EMAIL", nullable = false, length = 255)
	private String email;
	
	@Column(name = "IC_SITUACAO", nullable = false, length = 1)
	private String situacao;
	
	@Column(name = "NU_TELEFONE", length = 11)
	private String numeroTelefone;	
	
	@Column(name = "IC_PERFIL_ACESSO", nullable = false, length = 1)
	private Short perfilAcessoUsuario;
	
	@ManyToOne
	@JoinColumn(name = "CO_FUNCAO", nullable = false)
	private FuncaoUsuarioExterno funcaoUsuarioExterno;
	
	public UsuarioExterno() {}

	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public Short getPerfilAcessoUsuario() {
		return perfilAcessoUsuario;
	}
	public void setPerfilAcessoUsuario(Short perfilAcessoUsuario) {
		this.perfilAcessoUsuario = perfilAcessoUsuario;
	}

	public FuncaoUsuarioExterno getFuncaoUsuarioExterno() {
		return funcaoUsuarioExterno;
	}
	public void setFuncaoUsuarioExterno(FuncaoUsuarioExterno funcaoUsuarioExterno) {
		this.funcaoUsuarioExterno = funcaoUsuarioExterno;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(getNumeroCpf());
        builder.append(getNomeUsuario());
        
        return builder.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof UsuarioExterno)) {
            return false;
        }
		
		UsuarioExterno other  = (UsuarioExterno) o;
        EqualsBuilder builder = new EqualsBuilder();
        builder.append(getNumeroCpf(), other.getNumeroCpf());
        builder.append(getNomeUsuario(), other.getNomeUsuario());
        
        return builder.isEquals();
	}
	
}
