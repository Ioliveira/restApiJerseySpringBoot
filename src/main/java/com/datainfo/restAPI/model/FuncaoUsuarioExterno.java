package com.datainfo.restAPI.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity
@Table(name = "FUNCAO_USUARIO_EXTERNO")
public class FuncaoUsuarioExterno implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7047802909459283756L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "CO_FUNCAO", nullable = false)
	private Long codFuncao;
	
	@Column(name = "NO_FUNCAO", nullable = false, length = 50)
	private String nomeFuncao;
	
	public FuncaoUsuarioExterno() {}
	
	public Long getCodFuncao() {
		return codFuncao;
	}
	public void setCodFuncao(Long codFuncao) {
		this.codFuncao = codFuncao;
	}
	
	public String getNomeFuncao() {
		return nomeFuncao;
	}
	public void setNomeFuncao(String nomeFuncao) {
		this.nomeFuncao = nomeFuncao;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(getCodFuncao());
        builder.append(getNomeFuncao());
        
        return builder.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof FuncaoUsuarioExterno)) {
            return false;
        }
		
		FuncaoUsuarioExterno other  = (FuncaoUsuarioExterno) o;
        EqualsBuilder builder = new EqualsBuilder();
        builder.append(getCodFuncao(), other.getCodFuncao());
        builder.append(getNomeFuncao(), other.getNomeFuncao());
        
        return builder.isEquals();
	}
	
}
