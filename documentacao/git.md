# documentação GIT

## Comandos GIT

Comando para adicionar arquivos na caixa

    git add .                

Comando para fechar a caixa

    git commit - m "Descrição do comentario"

comando para salvar credenciais

    git config credential.helper 'store'

comando para limpar cache
    
    git rm -r --cached .

comando para criar branch local

    git branch <branch name>

comando para acessar nova branch local

    git checkout <branch name>

comando para criar e acessar nova branch
    
    git checkout -b <branch name>

comando para deletar branch local

    git branch -d <branch name>

comando para deletar branch remota

    git push origin --delete <branch name>
