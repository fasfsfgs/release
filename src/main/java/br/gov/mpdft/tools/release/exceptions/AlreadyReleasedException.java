package br.gov.mpdft.tools.release.exceptions;

public class AlreadyReleasedException extends MensagemUsuarioException
{
    public AlreadyReleasedException()
    {
        super("A vers�o do projeto n�o � SNAPSHOT.\nPq diabos vc est� tentando fechar um projeto j� fechado?");
    }
}
