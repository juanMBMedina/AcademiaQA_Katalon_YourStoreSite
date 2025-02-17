FROM katalonstudio/katalon:latest
USER root
RUN apt-get update && apt-get install -y git
CMD ["sh", "-c", "git clone https://github.com/juanMBMedina/AcademiaQA_Katalon_YourStoreSite.git /katalon/katalon/source && katalonc -noSplash"]