![postman-logo text-320x132](https://user-images.githubusercontent.com/4249709/29496848-63ad446c-85b1-11e7-904e-a4ddad25e9db.png)


## Características: 
  	- Validar a requisição dos serviços 
	- Validar body, header e cookies
	- Não é possível validar performance (Load testing) no Postman 
	- Linguagem de progrmação utilizada: javascript  
	- Ferramenta gratuita
   	- Não é necessário instalar EXE - é uma extensão do Google Chrome
	- Funciona em qualquer plataforma: Windows, MacOS e Linux
	- Converte JSON em várias linguagens (EX: Python, PHP, RUBY)
	- Sincronização entre diversos aplicativos
	- Sincroniza código entre equipes (Versão paga)

## Outras Ferramentas: 
    - SOAPUI
	- Runscope
	- Curl
	- Cfix
	- Check
	- CTESK
	- dotTEST
	- Eclipse SDK tool- Automated API testing

## Newman 

	Objetivo:
	É um comando de linha utilizado para rodar as collection do Postman. A partir deste comando é possível inserir iterações,gerar relatórios em html, json etc.. 

## Instalação: 

	npm install -g newman

## Comand Basic: 

	Options:

	Utility:
	-h, --help                      output usage information
	-v, --version                   output the version number

	Basic setup:
	--folder [folderName]           Specify a single folder to run from a collection.
	-e, --environment [file|URL]    Specify a Postman environment as a JSON [file]
	-d, --data [file]               Specify a data file to use either json or csv
	-g, --global [file]             Specify a Postman globals file as JSON [file]
	-n, --iteration-count [number]  Define the number of iterations to run

	Request options:
	--delay-request [number]        Specify a delay (in ms) between requests [number]
	--timeout-request [number]      Specify a request timeout (in ms) for a request
	Misc.:
	--bail                          Stops the runner when a test case fails
	--silent                        Disable terminal output
	--no-color                      Disable colored output
	-k, --insecure                  Disable strict ssl
	-x, --suppress-exit-code        Continue running tests even after a failure, but exit with code=0
	--ignore-redirects              Disable automatic following of 3XX responses


## Rodar os Testes via Newman 

	Exemplo: 
	
	newman run https://www.getpostman.com/collections/b4edd0d5uouuuyy3540be6e95ff?_ga=2.228191262.2023271780.1503278717-2133731189.1500040125 -g globals.postman_globals.json -n 2 --bail -r html


## Links 

	https://www.npmjs.com/package/newman
	https://www.getpostman.com/docs/postman/collection_runs/command_line_integration_with_newman
	
	
 

