﻿using ClinicService.Models;

namespace ClinicService.Services.Impl
{
    /// <summary>
    /// ДОМАШНЯЯ РАБОТА Добавить имплементацию для текущего репозитория
    /// </summary>
    public class ConsultationRepository : IConsultationRepository
    {
        public int Create(Consultation item)
        {
            SQLiteConnection connection = new SQLiteConnection(connectionString);
            connection.Open();
            SQLiteCommand command = new SQLiteCommand(connection);
            command.CommandText = "INSERT INTO Consultation(ClientId, PetId, ConsultationDate, Description) VALUES(@ClientId, @PetId, @ConsultationDate, @Description)";
            command.Parameters.AddWithValue("@ClientId", item.ClientId);
            command.Parameters.AddWithValue("@PetId", item.PetId);
            command.Parameters.AddWithValue("@ConsultationDate", item.ConsultationDate.Ticks);
            command.Parameters.AddWithValue("@Description", item.Description);
            command.Prepare();
            int res = command.ExecuteNonQuery();
            connection.Close();
            return res;
        }

        public int Delete(int id)
        {
            SQLiteConnection connection = new SQLiteConnection(connectionString);
            connection.Open();
            SQLiteCommand command = new SQLiteCommand(connection);
            command.CommandText = "DELETE FROM Consultation WHERE ConsultationId = @ConsultationId";
            command.Parameters.AddWithValue("@ConsultationId", id);
            command.Prepare();
            int res = command.ExecuteNonQuery();
            connection.Close();
            return res;
        }

        public IList<Consultation> GetAll()
        {
            List<Consultation> list = new List<Consultation>();
            SQLiteConnection connection = new SQLiteConnection(connectionString);
            connection.Open();
            SQLiteCommand command = new SQLiteCommand(connection);
            command.CommandText = "SELECT * FROM Consultation";
            SQLiteDataReader reader = command.ExecuteReader();

            while (reader.Read())
            {
                Consultation consultation = new Consultation();
                consultation.ConsultationId = reader.GetInt32(0);
                consultation.ClientId = reader.GetInt32(1);
                consultation.PetId = reader.GetInt32(2);
                consultation.ConsultationDate = reader.GetInt64(3);
                consultation.Description = reader.GetString(4);

                list.Add(consultation);
            }

            connection.Close();
            return list;
        }

        public Consultation GetById(int id)
        {
            SQLiteConnection connection = new SQLiteConnection(connectionString);
            connection.Open();
            SQLiteCommand command = new SQLiteCommand(connection);
            command.CommandText = "SELECT * FROM Consultation WHERE ConsultationId=@ConsultationId";
            command.Parameters.AddWithValue("@ConsultationId", id);
            command.Prepare();
            SQLiteDataReader reader = command.ExecuteReader();

            if (reader.Read())
            {
                Consultation consultation = new Consultation();
                consultation.ConsultationId = reader.GetInt32(0);
                consultation.ClientId = reader.GetInt32(1);
                consultation.PetId = reader.GetInt32(2);
                consultation.ConsultationDate = reader.GetInt64(3);
                consultation.Description = reader.GetString(4);

                connection.Close();
                return consultation;
            }
            else
            {
                connection.Close();
                return null;
            }

            public int Update(Consultation item)
            {
                SQLiteConnection connection = new SQLiteConnection(connectionString);
                connection.Open();
                SQLiteCommand command = new SQLiteCommand(connection);
                command.CommandText = "UPDATE Consultation SET ClientId = @ClientId, PetId = @PetId, ConsultationDate = @ConsultationDate, Description = @Description WHERE ConsultationId = @ConsultationId";
                command.Parameters.AddWithValue("@ClientId", item.ClientId);
                command.Parameters.AddWithValue("@PetId", item.PetId);
                command.Parameters.AddWithValue("@ConsultationDate", item.ConsultationDate.Ticks);
                command.Parameters.AddWithValue("@Description", item.Description);
                command.Prepare();
                int res = command.ExecuteNonQuery();
                connection.Close();
                return res;

            }
        }
}
