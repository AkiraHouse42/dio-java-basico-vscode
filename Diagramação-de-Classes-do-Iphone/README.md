 class Iphone {
        + tocarMusica()
        + pausarMusica()
        + selecionarMusica()
        + ligarTelefone()
        + atenderTelefone()
        + iniciarCorreioDeVoz()
        + exibirPagina()
        + adicionarNovaAba()
        + atualizarPagina()
    }

  class ReprodutorMusical {
        + tocarMusica()
        + pausarMusica()
        + selecionarMusica()
    }
    
    class AparelhoTelefonico {
        + ligarTelefone()
        + atenderTelefone()
        + iniciarCorreioDeVoz()
    }
    
    class NavegadorNaInternet {
        + exibirPagina()
        + adicionarNovaAba()
        + atualizarPagina()
    }

    ReprodutorMusical <|-- Iphone
    NavegadorDeInternet <|-- Iphone
    AparelhoTelefonico <|-- Iphone

    https://drive.google.com/file/d/1AgarrtJkw_dtnSbNFSCWRNFqWD2jJKAb/view?usp=sharing