#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/types.h> 
#include <sys/socket.h>
#include <netinet/in.h>

int sockfd, newsockfd, portno, clilen;
char buffer[256];

void error(char *msg)
{
	perror(msg);
	exit(1);
}

void sndMessage(char* msg)
{
	write(newsockfd, msg , strlen(msg));
}

char* rcvMessage()
{
	read(newsockfd,buffer,255);
	return buffer;
}

void initServer(int portno)
{
	struct sockaddr_in serv_addr, cli_addr;
	sockfd = socket(AF_INET, SOCK_STREAM, 0);

	if (sockfd < 0){
		error("ERROR opening socket");
	}
  
	serv_addr.sin_family = AF_INET;
	serv_addr.sin_addr.s_addr = INADDR_ANY;
	serv_addr.sin_port = htons(portno);

	if (bind(sockfd, (struct sockaddr *) &serv_addr, sizeof(serv_addr)) < 0){
		error("ERROR on binding");
	}

	listen(sockfd,5);
	clilen = sizeof(cli_addr);
	newsockfd = accept(sockfd, (struct sockaddr *) &cli_addr, &clilen);
	if (newsockfd < 0){
		error("ERROR on accept");
	} else {
		printf("----------------------------\n", portno);
		printf("Server startet at port %d \n", portno);
		printf("----------------------------\n", portno);
	}
}
